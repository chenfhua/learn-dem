export interface User {
  id: number
  name: string
  email: string
  age: number | null
  createdAt?: string
}

export interface CreateUserRequest {
  name: string
  email: string
  age: number | null
}
