import {createRouter, createWebHistory} from "vue-router"

import Login from '../views/login/Login.vue'
import Register from '../views/register/Register.vue'
import Home from '../views/home/Home.vue'
const routes = [
    {
        path:'/',
        redirect:'/login'
    },
    {
        path:'/login',
        component:Login
    },
    {
        path:'/register',
        component:Register
    },
    {
        path:'/home',
        component:Home
    }
]

const router = createRouter({
    mode:'history',
    history:createWebHistory(),
    routes
})
export default router
