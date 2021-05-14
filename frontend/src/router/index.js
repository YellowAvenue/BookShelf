import { createRouter, createWebHashHistory } from 'vue-router'

const routes = [
  {
    path:'/products',
    name:'Products',
    component: () => import('../views/Products')
  },
  {
    path: '/main',
    name:'Main',
    component: () => import('../views/Main')
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
