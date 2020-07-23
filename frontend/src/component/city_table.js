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

  render() {
    return (
      <table>
        <tr>
          <th>Город</th>
          <th>Сообщение</th>
        </tr>
        <tr>
          <td>{this.state.items.city}</td>
          <td>{this.state.items.hint}</td>
        </tr>
      </table>
    )
  }
}

export default CityTable;

