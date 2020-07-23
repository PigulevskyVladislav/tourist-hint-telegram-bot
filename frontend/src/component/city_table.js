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

  renderTableData() {
    return this.state.items.map((city, index) => {
      const {id, name, hint} = city
      return (
        <tr key={index}>
          <td>{id}</td>
          <td>{name}</td>
          <td>{hint}</td>
        </tr>
      );
    })
  }

  render() {

    return (
      <table>
        <tbody>
          {this.renderTableData()}
        </tbody>
      </table>
    )
  }
}

export default CityTable;

