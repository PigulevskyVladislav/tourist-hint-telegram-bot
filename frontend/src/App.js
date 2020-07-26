import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'
import CityList from './page/city_list';
import CityInsert from './page/city_insert';
import CityUpdate from './page/city_update';
import NotFoundPage from './page/not_found_page';
import './App.css';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path='/' component={CityList}/>
        <Route exact path='/cities' component={CityList}/>
        <Route path='/cities/create' component={CityInsert}/>
        <Route path='/cities/update/:cityID' component={CityUpdate}/>
        <Route path='*' component={NotFoundPage}/>
      </Switch>
    </Router>
  );
}

export default App;
