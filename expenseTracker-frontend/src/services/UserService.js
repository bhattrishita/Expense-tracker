import axios from 'axios';

const API_BASE = 'http://localhost:8080/api/users';

export const getUsers = () => {
  return axios.get(API_BASE);
};

export const createUser = (user) => {
  return axios.post(API_BASE, user);
};


