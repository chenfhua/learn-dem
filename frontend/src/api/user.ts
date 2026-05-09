import axios from 'axios'
import type { User, CreateUserRequest } from '../types/user'

const api = axios.create({
  baseURL: '/api'
})

export const userApi = {
  async getAll(): Promise<User[]> {
    const { data } = await api.get<User[]>('/users')
    return data
  },

  async getById(id: number): Promise<User> {
    const { data } = await api.get<User>(`/users/${id}`)
    return data
  },

  async create(data: CreateUserRequest): Promise<User> {
    const response = await api.post<User>('/users', data)
    return response.data
  },

  async update(id: number, data: CreateUserRequest): Promise<User> {
    const response = await api.put<User>(`/users/${id}`, data)
    return response.data
  },

  async delete(id: number): Promise<void> {
    await api.delete(`/users/${id}`)
  }
}
