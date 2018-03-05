// pages/team/team.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    listData: [
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    var that = this;
    wx.request({
      url: 'http://127.0.0.1:8080/get',
      data: {
        x: '',
        y: ''
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)
        var listData1 = new Array();
        for (var i = 0; i < res.data.length; i++) {
          listData1[i] = new Object();
          listData1[i].name = res.data[i].teamName;
          var list = res.data[i].members;
          listData1[i].content = "";
          for (var j = 0; j < 4; j++) {
            if (list[j].number == res.data[i].leaderNumber) {
              listData1[i].leader = list[j].name
            } else {
              listData1[i].content += list[j].name + " ";
            }
          }
          that.setData({
            listData: listData1
          })
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})