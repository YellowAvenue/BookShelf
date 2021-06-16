<template>
<div>
  <p v-for="product in products" :key="product.id">{{product}}</p>
</div>
</template>

<script>
import axios from 'axios'
export default {
  name: "AllProducts",
  data(){
    return {
      products: [],
      url: {
        allProducts: 'http://localhost:8080/products'
      }
    }
  },
  methods:{
    getProducts: function (){
      axios.get(this.url.allProducts)
          .then((response) => {
            console.log("adsdfadfs")
            console.log(response.data)
            this.products = response.data
            console.log(this.products)
          })
    }
  },
  created: function (){
    this.getProducts();
  }

}
</script>

<style scoped>

</style>