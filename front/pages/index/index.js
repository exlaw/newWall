//index.js
//获取应用实例
const app = getApp()
Page({
  data: {
    array:[1,1,1,1,1,1,1],
    script:""
  },
  onLoad: function () {
     
  },
  addAnswer: function() {
    var that=this;
    wx.request({
      url: 'http://127.0.0.1:8081', //仅为示例，并非真实的接口地址
      data: {
        x: '',
        y: ''
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)
        console.log(this)
        that.setData({
          script: res.data
        })
      }
    })
  }
})
