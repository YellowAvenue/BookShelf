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
            <img class="card-img-top imgSize" src="/img/Books/MainPage/DevochkaSova.webp" alt="DevochkaSova.webp">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">Девочка по имени<br>Сова</h4>
              <h5>Эми Уилсон</h5>
              <p class="card-text hiddenText">Девочка с необычным именем Сова очень хочет узнать, кто её отец. Но сделать это не так-то просто – вместо ответов</p>
              <h6>Цена: 714 <strike>1296</strike> руб.</h6>
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
              <h4 class="card-title" style="margin-bottom:.5rem">Эра<br>медведей </h4>
              <h5>Максим Бобров</h5>
              <p class="card-text hiddenText">Еще вчера Илья был легендой киберспорта, а сегодня он никому не нужный неудачник. Но однажды  его жизнь круто</p>
              <h6>Цена: 374 руб</h6>
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
              <h4 class="card-title" style="margin-bottom:.5rem">Общение всего живого</h4>
              <h5>Жоэль Бокар</h5>
              <p class="card-text hiddenText">Долгое время считалось, что общаться способны только представители вида Homo sapiens.  Все живые существа</p>
              <h6>Цена: 317 руб.</h6>
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
              <h4 class="card-title" style="margin-bottom:.5rem">Милашка<br>на вираже</h4>
              <h5>Дарья Донцова</h5>
              <p class="card-text hiddenText">Семья становится счастливой, когда тараканы в головах мужа и жены начинают дружить семьями. Так заявила Виоле</p>
              <h6>Цена: 470 руб.</h6>
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

  <!--Кнопки с Аннотациями-->

  <!-- Общение всего живого-->
  <div class="overlay" data-close=""></div>
  <div id="modal_ObshenieVsegoZhivogo" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    Долгое время считалось, что общаться способны только представители вида Homo sapiens. Но речь не единственный способ общения. Все живые существа: животные, растения, бактерии, грибы и даже каждая их клетка - используют химическое общение, зачастую очень сложное и исключительно эффективное, а многие, кроме того, применяют для связи друг с другом жесты, звуки и световые сигналы. И дело не просто в удовольствии от контактов с себе подобными. Коммуникация очень важна для жизни и эволюции - настолько, что высказывание Декарта "Я мыслю, следовательно, я существую" вполне можно было бы заменить фразой "Я общаюсь, следовательно, я существую".
  </div>

  <!-- Эра медведей-->
  <div class="overlay" data-close=""></div>
  <div id="modal_EraMedvedey" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    Еще вчера Илья был легендой киберспорта, а сегодня он никому не нужный неудачник. Но однажды его жизнь круто меняется: Илья узнает, что его дочь Варя тоже стала киберспортсменкой. Однако, Варя не только талантлива, но и крайне цинична, а значит она может повторить его судьбу. Чтобы стать для дочери примером, Илья решает вернуться в киберспорт и сделать невозможное – выиграть чемпионат мира. Токсичная среда, разрушенная репутация и возраст встают на пути к его цели. Но самое главное – Варя презирает отца и всеми силами пытается похоронить его устремления.
    <br><br>
    Роман открывает изнанку киберспорта, в котором нередко восемнадцатилетние игроки становятся долларовыми миллионерами, но вместе с тем там царит безграничный
    цинизм и рушатся судьбы многих молодых людей.
  </div>

  <!-- Милашка на проводе-->
  <div class="overlay" data-close=""></div>
  <div id="modal_MilashkaNaVirazhe" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    Семья становится счастливой, когда тараканы в головах мужа и жены начинают дружить семьями. Так заявила Виоле Таракановой её бывшая одноклассница Ирина. Они не виделись много лет, но сейчас Ире нужна помощь. Вилка не может ей отказать и узнает странную историю: еще одна их одноклассница Настя Тихонова в свое время удачно вышла замуж за богатого бизнесмена, жила счастливо, но трагически погибла в автомобильной катастрофе. А совсем недавно Ира встретилась с одной женщиной и узнала в ней … Настю, поэтому уверена, что Тихонова жива! Виоле надо непременно доказать, что смерть на шоссе - спектакль. Таракановой совсем не хочется помогать Ирине, но они с Дмитриевым вынуждены разбираться в этом запутанном деле. Степан и Виола проделали колоссальную работу, и вывели на чистую воду того, кого меньше всего ожидали…
  </div>

</template>

<script>
export default {
  name: "NewsSection.vue"
}
</script>

<style scoped>

</style>