<template>
<div>
  <el-table
      :data="tableData"
      border
      style="width: 100%">
    <el-table-column
        prop="name"
        label="姓名"
        width="180">
    </el-table-column>
    <el-table-column
        prop="number"
        label="电话"
        width="180">
    </el-table-column>
    <el-table-column
        prop="address"
        label="地址">
    </el-table-column>
    <el-table-column
    label="操作">
      <template v-slot="{row}">
        <el-button type="success" :plain="true" @click="add()">添加</el-button>
        <el-button type="primary" :plain="true" @click="update(row)">修改</el-button>
        <el-button type="danger" :plain="true" @click="deleteById(row.id)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</div>
</template>

<style scoped>

</style>

<script>

export default({
  name: 'Index',
  mounted(){         		 //实例挂载后直接运行
    this.show();
  },
  methods:{
    show(){
      this.$http({
        method:"post",
        url:'phone/show',
      }).then(res=>{
        if (res.data.code===200){
          this.tableData=res.data.data
        }
      })
    },
    add(){
      this.$router.push({path:"Add"})
    },
    update(row){
      this.$router.push({path:'Update',query:{row:row}})
    },
    deleteById(id){
      this.$http({
        method:'post',
        url:'phone/delete',
        params:{
          id:id,
        }
      }).then(res=>{
        if (res.data.code===200){
          this.show()
          this.$message({
            showClose: true,
            message: '删除成功',
            type: 'success'
          })
        }
      })
    }
  },
  data() {				//数据
    return {
      tableData: []
    }
  }
})
</script>