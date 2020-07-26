import React, { Component } from 'react';
import CityForm from '../component/city_form'

class CityInsert extends Component {
  constructor(props) {
    super(props);

    this.state = {
      name: '', hint: ''
    }

    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleSubmit(callback) {
    let data = this.state;
    fetch('http://localhost:8080/cities', {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        }
    }).then(res => {
        if (res.ok) {
          callback();
        } else {
          alert('Ошибка при сохранении');
        }
        return res;
    }).catch(err => {
      alert('Ошибка соединения');
      return err;
    });

    
  }

  handleCityChange = (newName) => {
    this.setState({
      name: newName
    })
  }

  handleHintChange = (newHint) => {
    this.setState({
      hint: newHint
    })
  }

  render() {
    return (
      <div>
        <CityForm submitButtonText='Создать'
                  onSubmit={this.handleSubmit}
                  onCityChange={this.handleCityChange}
                  onHintChange={this.handleHintChange}
                  name={this.state.name}
                  hint={this.state.hint}
        />
      </div>
    )
  }
}

export default CityInsert;