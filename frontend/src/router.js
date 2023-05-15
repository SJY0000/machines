
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DeviceManager from "./components/listers/DeviceCards"
import DeviceDetail from "./components/listers/DeviceDetail"
import DeviceManager from "./components/listers/DeviceCards"
import DeviceDetail from "./components/listers/DeviceDetail"
import DeviceManager from "./components/listers/DeviceCards"
import DeviceDetail from "./components/listers/DeviceDetail"
import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"
import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/devices',
                name: 'DeviceManager',
                component: DeviceManager
            },
            {
                path: '/devices/:id',
                name: 'DeviceDetail',
                component: DeviceDetail
            },
            {
                path: '/devices',
                name: 'DeviceManager',
                component: DeviceManager
            },
            {
                path: '/devices/:id',
                name: 'DeviceDetail',
                component: DeviceDetail
            },
            {
                path: '/devices',
                name: 'DeviceManager',
                component: DeviceManager
            },
            {
                path: '/devices/:id',
                name: 'DeviceDetail',
                component: DeviceDetail
            },
            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },
            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },



    ]
})
