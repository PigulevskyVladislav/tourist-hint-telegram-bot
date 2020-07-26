import React, { Component } from 'react';
import { withRouter} from 'react-router-dom';

class CityForm extends Component {
  constructor(props) {
    super(props);

    this.handleCityChange = this.handleCityChange.bind(this);
    this.handleHintChange = this.handleHintChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleCityChange(e) {
    this.props.onCityChange(
      e.target.value
      );
  }

  handleHintChange(e) {
    this.props.onHintChange(
      e.target.value
    );
  }

  handleSubmit = (e) => {
    e.preventDefault();
    this.props.onSubmit(() => {
      this.props.history.push('/cities');
    });
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <div>
          <label>Город</label>
          <div>
            <input type="text"
                   maxlength = "25"
                   required="required"
                   value={this.props.name}
                   onChange={this.handleCityChange}
                   className="form-control"/>
          </div>
        </div>
        <div>
          <label>Сообщение</label>
          <div>
            <textarea type="text"
                      id="input_area"
                      required="required"
                      value={this.props.hint}
                      onChange={this.handleHintChange}/>
          </div>
        </div>
        <div>
          <div>
            <button type="submit">
              {this.props.submitButtonText}
            </button>
          </div>
        </div>
      </form>
    )
  }
}

export default withRouter(CityForm);