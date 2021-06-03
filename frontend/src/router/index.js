import { createRouter, createWebHashHistory } from 'vue-router'

const routes = [
  {
    path: '/main',
    name:'Main',
    component: () => import('../views/Main')
  },
  {
    path: '/classic',
    name:'Classic',
    component: () => import('../views/Classic')
  },
  {
    path: '/stationary',
    name:'Stationary',
    component: () => import('../views/Stationery')
  },
  {
    path: '/School',
    name:'School',
    component: () => import('../views/School')
  },
  {
    path: '/aboutUs',
    name:'AboutUs',
    component: () => import('../views/AboutUs')
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
