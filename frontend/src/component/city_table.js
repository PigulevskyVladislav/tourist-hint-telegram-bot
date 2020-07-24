import React, { Component } from 'react';

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
      .then(results => this.setState({items: results}
      ));
  }

  deleteCityFetch(id) {
    return fetch('http://localhost:8080/cities/' + id, {
        method: 'DELETE'
    }).then(res => {
        return res;
    }).catch(error => error)
  }

  handleDeleteClick(id) {
    this.deleteCityFetch(id)
    .then(
      this.setState({items: this.state.items.filter(city => city.id !== id)})
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
          <td>{hint}</td>
          <td>
            <button onClick={() => this.handleDeleteClick(id)}>DELETE</button>
          </td>
        </tr>
      );
    })
  }

  render() {

    return (
      <table>
        <thead>
          <tr>
            <th>Город</th>
            <th>Сообщение</th>
          </tr>
        </thead>

        <tbody>
          {this.renderTableData()}
        </tbody>
      </table>
    )
  }
}

export default CityTable;

