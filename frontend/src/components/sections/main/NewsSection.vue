<template>
  <div class="book-block">
    <h2 class="block-title">Новинки</h2>
    <div class = "delimetr"></div>
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
                      data-modal="modal_DevochkaSova">Подробнее</button>
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
                      data-modal="modal_EraMedvedey">Подробнее</button>
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
                      data-modal="modal_ObshenieVsegoZhivogo">Подробнее</button>
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
                      data-modal="modal_MilashkaNaVirazhe" >Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy" >Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
      </div>
    </div>
  </div>

<!--  Кнопки с Аннотациями-->

  <!-- Общение всего живого-->
  <div class="overlay" data-close=""></div>
  <div id="modal_ObshenieVsegoZhivogo" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[0].description}}
     </div>

  <!-- Эра медведей-->
  <div class="overlay" data-close=""></div>
  <div id="modal_EraMedvedey" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[1].description}}
  </div>

  <!-- Милашка на проводе-->
  <div class="overlay" data-close=""></div>
  <div id="modal_MilashkaNaVirazhe" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    {{products[0].description}}
      </div>

</template>

<script>
import axios from "axios";

export default {
  async setup(){
    let products = await
        axios.post("http://localhost:8080/api/products/getProductsSection", ['1','2','3','4'])
            .then(response => {
              return response.data
            });
    return{
      products
    }
  },
  name: "NewsSection.vue",
}
</script>

<style scoped>

</style>