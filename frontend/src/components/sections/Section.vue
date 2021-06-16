<template>
  <div class="book-block">

    <div class="container" style="padding-top: 40px;">

      <!--Карточки-->

      <div class="row">
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" :src=products[0].img_path alt="DevochkaSova.webp">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[0].name}}</h4>
              <h5>{{products[0].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[0].short_description}}</p>
              <h6>Цена: {{products[0].cost}} руб.</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      :data-modal="productsId[0]">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>

        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" :src=products[1].img_path alt="EraMedvedey.jpg">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[1].name}}</h4>
              <h5>{{products[1].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[1].short_description}}</p>
              <h6>Цена: {{products[1].cost}} руб</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      :data-modal="productsId[1]">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" :src=products[2].img_path alt="ObshenieVsegoZhivogo.png">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[2].name}}</h4>
              <h5>{{products[2].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[2].short_description}}</p>
              <h6>Цена: {{products[2].cost}} руб.</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      :data-modal="productsId[2]">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" :src=products[3].img_path alt="MilashkaNaVirazhe.jpg">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">{{products[3].name}}</h4>
              <h5>{{products[3].maker.name}}</h5>
              <p class="card-text hiddenText">{{products[3].short_description}}</p>
              <h6>Цена: {{products[3].cost}} руб.</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      :data-modal="productsId[3]" >Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy" >Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
      </div>
    </div>
  </div>

<!--  Кнопки с Аннотациями-->
<!--  TODO  показывает окна первого компонента-->
  <div class="overlay" data-close=""></div>
  <div :id="productsId[0]"  class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[0].description}}
  </div>

  <div class="overlay" data-close=""></div>
  <div :id="productsId[1]" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[1].description}}
  </div>

  <div class="overlay" data-close=""></div>
  <div :id="productsId[2]" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[2].description}}
  </div>

  <div class="overlay" data-close=""></div>
  <div :id="productsId[3]" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[3].description}}
      </div>
</template>

<script>
import axios from "axios";
import '@/assets/sass/popup-window.scss';
import {popUpWindow} from '@/components/mixins/popUpWindow';

export default {
  props: {
    productsId: Array
  },
  async setup(productsId){
    console.log(productsId)
    let products = await
        axios.post("http://localhost:8080/api/products/getProductsSection", productsId)
            .then(response => {
              return response.data
            });
    return{
      products
    }
  }
  ,
  name: "Section.vue",
  mounted() {
    popUpWindow.method.popUp();
  }

}
</script>

<style scoped>

</style>