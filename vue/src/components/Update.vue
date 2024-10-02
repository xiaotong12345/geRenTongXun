
<template>
  <div>
    <el-form ref="form" :model="form" label-width="80px">
      <el-form-item label="姓名">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="电话">
        <el-input v-model="form.number"></el-input>
      </el-form-item>
      <el-form-item label="地址">
        <el-input type="textarea" v-model="form.address"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">修改</el-button>
        <el-button @click="forback()">取消</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<style scoped>

</style>

<script>
export default {
  name:'Update',
  mounted() {
    this.init();
  },
  methods:{
    init(){
      this.form=this.$route.query.row
    },
    onSubmit() {
      this.$http({
        method:'post',
        url:'phone/update',
        data:{
          id:this.form.id,
          name:this.form.name,
          number:this.form.number,
          address:this.form.address
        }
      }).then(res=>{
        if (res.data.code===200){
          this.$message({
            showClose: true,
            message: '修改成功',
            type: 'success',
          })
          this.$router.push({path:'/'})
        }
      })
    },
    forback(){
      this.$router.push({path:'/'})
    }
  },
  data(){
    return {
      form: {
        id:'',
        name: '',
        number:'',
        address:'',
      }
    }
  }
}
</script>