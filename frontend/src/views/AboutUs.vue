<template>
  <Header></Header>

  <div class = "book-block">
    <div class="sticker">
      <div class = "block-title sticker-title">Кто мы такие?</div>
      <div class="container sticker-main-text" style="text-align: center">
        Мы те, кто радует наших покупателей уже 15 лет.<br>
        Мы те, у кого есть всё, что вы хотите прочитать и даже больше...<br>
        Мы те, кто заботится о наших покупателях.<br>
        Мы - ваш любимый книжный магазин!
      </div>
    </div>
    <div class="sticker">
      <div class = "block-title sticker-title">Почему стоит покупать именно у нас?</div>
      <div class="container sticker-main-text">
        <ul>
          <li>У нас стоит покупать потому что, только в нашем магазине вы найдёте качественные товары по самым
            низким ценам (если найдёте дешевле, то мы компенсируем разницу). </li>
          <li>Быстрый процесс оформления! Наши менеджеры работают 24 часа в сутки без выходных. Вам перезвонят в
            течении 5 минут после оформления заявки.</li>
          <li>Быстрый процесс оформления! Наши менеджеры работают 24 часа в сутки без выходных. Вам перезвонят
            в течении 5 минут после оформления заявки.</li>
          <li>При покупке книг у нас, вы получаете небольшой сувенир.</li>
          <li>Если вы забираете товар самовывозом, то в наших уютных магазинах вы можете выпить наш фирменный
            манговый чай, заказанный прямиком из Индии.</li>
        </ul>
      </div>
    </div>
    <div class="sticker">
      <div class = "block-title">О доставке</div>
      <div class="container sticker-main-text">
        После того как вы оставили заявку на покупку на нашем сайте, вам перезвонит наш менеджер.
        Договоритесь о дате, времени и адресе доставки. Наша доставка работает по всему миру. Цена доставки по г.
        Москве и по г. Санкт-Петербургу - 350 руб. Цена доставки по России - 800 руб. Цена доставки о миру
        обговаривается в телефонном звонке с менеджером
      </div>
    </div>
    <div class="sticker">
      <div class = "block-title">Самовывоз из Москвы</div>
      <div class="container sticker-main-text">
        Адрес магазина в Москве: метро Кузнецкий мост, улица Книжная дом 33, подъезд 4.<br>
        Как пройти к нашему магазину:<br>
        После того, как вы вышли из метро, идите прямо, примерно 500 метров, поверните направо во двор.
        Там вы увидите наш магазин.
      </div>
    </div>
    <div class="sticker">
      <div class = "block-title">Самовывоз из Санкт-Петербурга</div>
      <div class="container sticker-main-text">
        Адрес магазина в Санкт-Петербурге: метро Достоевская, улица Библиотечная, дом 45.<br>
        Как пройти к нашему магазину:<br>
        После того, как вы вышли из метро, поверните налево и идите 800 метров, вы увидите Торговый центр "Орион".
        На втором этаже этого ТЦ находится наш магазин.
      </div>
    </div>
  </div>

  <div class="endblock"><br></div>
  <!--Модальное окно для кнопки "Купить"-->
  <BuyModal></BuyModal>
  <!-- Модальное окно входа -->
  <SingInModal></SingInModal>
  <!-- Модальное окно регистрации -->
  <RegistrationModal></RegistrationModal>

</template>

<script>
import '@/assets/sass/head.scss';
import '@/assets/sass/menu.scss';
import '@/assets/sass/aboutUs.scss';
import '@/assets/sass/popup-window.scss';
import {popUpWindow} from '@/components/mixins/popUpWindow';
import Header from "@/components/Header";
import BuyModal from "@/components/modals/BuyModal";
import SingInModal from "@/components/modals/SingInModal";
import RegistrationModal from "@/components/modals/RegistrationModal";
export default {
  name: "AboutUs",
  components: {RegistrationModal, SingInModal, BuyModal, Header},
  mixins: [popUpWindow]
}
</script>

<style scoped>

</style>