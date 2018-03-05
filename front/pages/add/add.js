// pages/add/add.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    teamName:'',
    leaderName:'',
    leaderNumber: '',
    member1Name: '',
    member1Number: '',
    member2Name: '',
    member2Number: '',
    mumber3Name: '',
    mumber3Number: ''
  },

  register: function (e) {

    console.log(e.detail.value)
    console.log(this.data)
    var send=true;
    if (this.data.teamName==''||
      this.data.leaderName == '' ||
      this.data.leaderNumber == '' ||
      this.data.member1Name == ''||
      this.data.member1Number == ''||
      this.data.member2Name ==''||
      this.data.member2Number =='' ||
      this.data.member3Name == '' ||
      this.data.member3Number =='')
    send=false;
    var param = new Object;
    param.id = null;
    param.teamName = this.data.teamName;
    param.leaderNumber = this.data.leaderNumber;
    param.members = new Array();
   
    param.members[0] = new Object;
    param.members[0].id = null;
    param.members[0].name = this.data.leaderName;
    param.members[0].number = this.data.leaderNumber;
    param.members[0].teamID = null;

    param.members[1] = new Object;
    param.members[1].id = null;
    param.members[1].name = this.data.member1Name;
    param.members[1].number = this.data.member1Number;
    param.members[1].teamID = null;
   
    param.members[2] = new Object;
    param.members[2].id = null;
    param.members[2].name = this.data.member2Name;
    param.members[2].number = this.data.member2Number;
    param.members[2].teamID = null;
    
    param.members[3] = new Object;
    param.members[3].id = null;
    param.members[3].name = this.data.member3Name;
    param.members[3].number = this.data.member3Number;
    param.members[3].teamID = null;
    
    console.log(param);
    if(send)
    wx.request({
      url: 'http://127.0.0.1:8080/put', //仅为示例，并非真实的接口地址
      data: {
        param:param
      },
      method: "POST",  
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {

      }
    })
    else
      wx.showModal({
        title: '标题',
        content: '你输入的信息不完整',
        showCancel: false, //不显示取消按钮
        confirmText: '确定'
      })
  },
  bteamname: function (e) {
    this.setData({
      teamName: e.detail.value
    })
  },
  bleadername: function (e) {
    this.setData({
      leaderName: e.detail.value
    })
  },
  bleadernumber: function (e) {
    this.setData({
      leaderNumber: e.detail.value
    })
  },
  bmember1name: function (e) {
    this.setData({
      member1Name: e.detail.value
    })
  },
  bmember1number: function (e) {
    this.setData({
      member1Number: e.detail.value
    })
  },
  bmember2name: function (e) {
    this.setData({
      member2Name: e.detail.value
    })
  },
  bmember2number: function (e) {
    this.setData({
      member2Number: e.detail.value
    })
  },
  bmember3name: function (e) {
    this.setData({
      member3Name: e.detail.value
    })
  },
  bmember3number: function (e) {
    this.setData({
      member3Number: e.detail.value
    })
  }
})