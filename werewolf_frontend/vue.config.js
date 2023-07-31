const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false,
  devServer:{
    historyApiFallback:true,
    allowedHosts:"all",
    proxy:{
      '/api':{
        target:'http://localhost:18088',
        ws:true,//websocket
        changeOrigin:true,
        pathRewrite:{
          '^/api': ' '
        }
      },
    }
  }
})
