import React, { Component } from 'react';
import CityTable from '../component/city_table';
import { Link } from 'react-router-dom';

class CityList extends Component {
  // handleCreateCity() {
  //   this.props.onSubmit();
  //   this.props.history.push('/cities');  
  // }

  render() {
    return (
      <div id='main_div'>
        <CityTable />
        <Link to={'/cities/create'} 
              className='button'
              id='add_button'> 
          Добавить запись 
        </Link>
      </div>
    )
  }
}

export default CityList;