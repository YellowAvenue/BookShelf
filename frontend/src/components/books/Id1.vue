<template>
<div>
  {{product}}
</div>
</template>

<script>
import axios from 'axios'
export default {
  name: "Id1",
  data() {
    return {
      product:{
        id:"",
        name:"",
        cost:"",
        image_path:"",
        description:"",
        short_description:"",
        maker:{
          id:"",
          name:""
        },
        product_type:""
      },
      url:{
        id1:"http://localhost:8080/api/products/get/1"
      }
    }
  },
  methods: {
    getProduct: function (){
      axios.get(this.url.id1)
          .then((response) =>{
            //TODO Если не саботает присваивай каждый параметр
            this.product = response.data
          })
    }
  },
  created: function (){
    this.getProduct();
  }
}
</script>

<style scoped>

</style>