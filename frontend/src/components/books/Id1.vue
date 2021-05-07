<template>
<div>
  <!-- Раздел новинок -->
  <div class="book-block">
    <h2 class="block-title">Новинки</h2>
    <div class = "delimetr"></div>
    <div class="container" style="padding-top: 40px;">

      <!--Карточки-->

      <div class="row">
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/DevochkaSova.webp" alt="DevochkaSova.webp">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[0].name}}</h4>
              <h5>{{products[0].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[0].short_description}}</p>
              <h6>{{'Цена: ' + products[0].cost + ' руб.'}}</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_DevochkaSova">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/EraMedvedey.jpg" alt="EraMedvedey.jpg">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[1].name}}</h4>
              <h5>{{products[1].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[1].short_description}}</p>
              <h6>{{'Цена:' + products[1].cost + ' руб.'}}</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_EraMedvedey">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/ObshenieVsegoZhivogo.png" alt="ObshenieVsegoZhivogo.png">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[2].name}}</h4>
              <h5>{{products[2].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[2].short_description}}</p>
              <h6>{{'Цена:' + products[2].cost + ' руб.'}}</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_ObshenieVsegoZhivogo">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/MilashkaNaVirazhe.jpg" alt="MilashkaNaVirazhe.jpg">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[3].name}}</h4>
              <h5>{{products[3].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[3].short_description}}</p>
              <h6>{{'Цена:' + products[3].cost + ' руб.'}}</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_MilashkaNaVirazhe" >Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy" >Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
      </div>
    </div>
  </div>
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
      products: [this.product, this.product, this.product],
      sectionIds: ['1','2','3', '4'],
      url:{
        id1:"http://localhost:8080/api/products/get/1",
        getSection:"http://localhost:8080/api/products/getProductsSection"
      }

    }
  },
  methods: {
    getProduct: function (){
      axios.get(this.url.id1)
          .then((response) =>{
            this.products = response.data
          })
    },
    getProductListById: function (){
      // let product0, product1 = this.product
      axios.post(this.url.getSection, this.sectionIds)
          .then((response) => {
            this.products = response.data
          })
      // product0 = this.products[0]
    }
  },
  created: function (){
    // this.getProduct();
    this.getProductListById()
  }
}
</script>

<style scoped>

</style>