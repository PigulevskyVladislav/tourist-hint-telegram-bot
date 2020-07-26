import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import PaginacionTabla from './paginacion_table';

class CityTable extends Component {
  constructor(props) {
    super(props)

    this.state = {
      items: [],
    }
  }

  componentDidMount() {
    this.getItems();
  }

  getItems() {
    fetch('http://localhost:8080/cities')
      .then(results => results.json())
      .then(results => this.setState({items: results},
      )).catch(err => err);;
  }

  deleteCityFetch(id) {
    return fetch('http://localhost:8080/cities/' + id, {
        method: 'DELETE'
    }).then(res => {
        return res;
    }).catch(err => {
      alert('Ошибка удаления');
      return err;
    });
  }

  handleDeleteClick(id) {
    this.deleteCityFetch(id)
    .then(
      this.setState({
        items: this.state.items.filter(
          city => city.id !== id)})
    ).catch(error => {
      console.error("Can't delete city", error)
    })
  }

  renderTableData() {
    return this.state.items.map((city, index) => {
      const {id, name, hint} = city
      return (
        <tr key={index} id={id}>
          <td>{name}</td>
          <td>
            <textarea className='textarea'
                      readOnly={true}
                      value={hint}>
            </textarea>
          </td>
          <td>
            <div className='button_column'>
              <button onClick={() => 
                        this.handleDeleteClick(id)}
                      className='button column_buttons'>
                Удалить
              </button>

              <Link to={'/cities/update/' + id}
                    className='button column_buttons'>
                Изменить 
              </Link>
            </div>
          </td>
        </tr>
      );
    })
  }

  render() {
    let data = this.renderTableData();
    return (
      <table>
        <thead>
          <tr>
            <th>Город</th>
            <th>Сообщение</th>
            <th />
          </tr>
        </thead>
        <PaginacionTabla
          itemsperpage={4}
          nocolumns={3}
          items={data}
          pagesspan={1}
        />
      </table>
    )
  }
}

export default CityTable;

