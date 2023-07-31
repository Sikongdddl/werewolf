import { createApp } from 'vue';
import App from './App.vue';
import ElementPlus from 'element-plus';
import axios from 'axios'
import 'element-plus/theme-chalk/index.css';

import router from "./router/index"

createApp(App)
    .use(ElementPlus)
    .use(router)
    .provide('$axios',axios)
    .mount('#app')

