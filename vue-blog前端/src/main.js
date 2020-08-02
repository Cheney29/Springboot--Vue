import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import "mavon-editor/dist/css/index.css"

import axios from 'axios'
import  mavonEditor from "mavon-editor"

import Element from 'element-ui'
import "element-ui/lib/theme-chalk/index.css"

import "./axios"
import "./premission"
Vue.config.productionTip = false
Vue.use(Element)
Vue.prototype.$axios = axios
Vue.use(mavonEditor)

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
