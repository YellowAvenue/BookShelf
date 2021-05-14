<template>
  <div class="book-block">
    <h2 class="block-title">Книги, способные перевернуть ваш разум...</h2>
    <div class = "delimetr"></div>
    <div class="container" style="padding-top: 40px;">
      <!--Карточки-->
      <div class="row">
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/RealnostVremeni.png" alt="RealnistVremeni.png">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">Реальность<br>времени</h4>
              <h5>Аймезен Жан-Клод</h5>
              <p class="card-text hiddenText">"Живи настоящим" - легко сказать, гораздо сложнее сделать. И причина не столько в психологии, сколько в самой природе времени</p>
              <h6>Цена: 518 руб.</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_RealnostVremeni">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/IgraNaNervah.png" alt="IgraNaNervah.png">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">Игра <br>на нервах</h4>
              <h5>Евгений Геншафт</h5>
              <p class="card-text hiddenText">Мы переживаем эмоции ежеминутно - радуемся, печалимся, ликуем, ненавидим, отчаиваемся</p>
              <h6>Цена: 403 руб</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_IgraNaNervah">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/Podsoznanie.jpg"
                 alt="PodsoznanieMozhetvse.jpg">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">Подсознание может<br>всё</h4>
              <h5>Джон Кехо</h5>
              <p class="card-text hiddenText">Автор этой книги в уединении среди лесов канадской провинции Британская Колумбия три года сосредоточенно</p>
              <h6>Цена: 362 <strike>452</strike> руб.</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_Podsoznanie">Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy">Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
        <div class="col-md-6 col-xl-3">
          <div class="card mx-auto mb-4 cardTransform" style="max-width: 300px; border: none">
            <!-- Изображение -->
            <img class="card-img-top imgSize" src="/img/Books/MainPage/Slushayte.png" alt="Slushayre.png">
            <!-- Текстовый контент -->
            <div class="card-body" style="padding: 0.7rem;">
              <h4 class="card-title" style="margin-bottom:.5rem">Слушайте! Искусство общения</h4>
              <h5>Дейл Карнеги</h5>
              <p class="card-text hiddenText">Почему порой так сложно понять друг друга в общении с коллегами, членами семьи или друзьями? Умение по-настоящему</p>
              <h6>Цена: 403 руб.</h6>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_Slushayte" >Подробнее</button>
              <button type="button" class="btn btn-dark" style="color: #feb386"
                      data-modal="modal_buy" >Купить</button>
            </div>
          </div><!-- Конец карточки -->
        </div>
      </div>
    </div>
  </div>

  <!--Кнопки с Аннотациями-->

  <!--Реальность времени-->
  <div class="overlay" data-close=""></div>
  <div id="modal_RealnostVremeni" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    "Живи настоящим" - легко сказать, гораздо сложнее сделать. И причина не столько в психологии, сколько в самой природе времени и человека. Задумайтесь: прямо сейчас, когда вы читаете эти слова, вы уже в прошлом.
    Понять ход времени: почему оно то ускоряется, то замедляется, куда уходит прошлое и откуда берется будущее - об этом испокон веков мечтали поэты и философы. Но вряд ли они справились бы без помощи ученых.
    <br>
    Жан-Клод Амейзен рассказывает о людях, умеющих путешествовать во времени: о палеонтологах, способных заглянуть на многие миллионы лет назад, чтобы прогуляться по субтропическим лесам Антарктиды; о нейрофизиологах, пытающихся "остановить" мгновение; об астрономах, стремящихся предсказать далекое будущее Вселенной.
  </div>

  <!--Игра на нервах-->
  <div class="overlay" data-close=""></div>
  <div id="modal_IgraNaNervah" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    Мы переживаем эмоции ежеминутно - радуемся, печалимся, ликуем, ненавидим, отчаиваемся, любим… Именно эмоции определяют наше поведение, отношение к происходящему и к людям, нас окружающим. Они помогают нам адаптироваться к внешнему миру. Но они же могут стать проблемой и причиной трагедии.
    <br>
    Способны ли мы подчинять эмоции своей воле? Возможно ли это в принципе? И нужно ли это? Реально ли вообще отказаться от эмоций и руководствоваться исключительно собственным разумом? Давайте попробуем в этом разобраться.
  </div>

  <!--Подсознание может всё-->
  <div class="overlay" data-close=""></div>
  <div id="modal_Podsoznanie" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    Мы переживаем эмоции ежеминутно - радуемся, печалимся, ликуем, ненавидим, отчаиваемся, любим… Именно эмоции определяют наше поведение, отношение к происходящему и к людям, нас окружающим. Они помогают нам адаптироваться к внешнему миру. Но они же могут стать проблемой и причиной трагедии.
    <br>
    Способны ли мы подчинять эмоции своей воле? Возможно ли это в принципе? И нужно ли это? Реально ли вообще отказаться от эмоций и руководствоваться исключительно собственным разумом? Давайте попробуем в этом разобраться.
  </div>

  <!--Слушайте! Искусство общения-->
  <div class="overlay" data-close=""></div>
  <div id="modal_Slushayte" class="dlg-modal">
    <span class="closer" data-close=""></span>
    <h4>Аннотация</h4>
    Почему порой так сложно понять друг друга в общении с коллегами, членами семьи или друзьями?
    <br>
    Умение по-настоящему слушать другого человека - это самый важный навык, способный помочь вам изменить свою жизнь, стать увереннее, доброжелательнее и достичь успеха. Именно поэтому так ценна книга, которую вы держите в руках.
    <br>
    Она поможет пройти путь от простого физиологического слышания к эффективному слушанию, включающему в себя еще и понимание. Это искусство, которому можно научиться. В конце концов, что есть искусство, как не постоянное совершенствование тех или иных навыков! Приводя яркие примеры и предлагая простые в освоении приемы общения и практические упражнения, авторы покажут вам, как стать идеальным собеседником.
  </div>
</template>

<script>
export default {
  name: "CrazyBookSection"
}
</script>

<style scoped>

</style>