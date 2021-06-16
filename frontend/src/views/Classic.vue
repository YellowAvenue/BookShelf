<template>
  <div class ="body">

    <Header></Header>

    <div class="book-block">
    <h2 class="block-title">Пушкин - солнце русской поэзии</h2>
    <div class = "delimetr"></div>
    </div>

    <suspense>
      <template #default>
        <Section :products-id="pushkinSectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <div class="book-block">
    <h2 class="block-title">Сколько ума в стихотворениях Лермонтова!</h2>
    <div class = "delimetr"></div>
    </div>

    <suspense>
      <template #default>
        <Section :products-id="lermontovSectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <div class="book-block">
    <h2 class="block-title">Словами великого классика - Л.Н.Толстого</h2>
    <div class = "delimetr"></div>
    </div>

    <suspense>
      <template #default>
        <Section :products-id="tolstoySectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <div class="endblock"><br></div>
    <!--Модальное окно для кнопки "Купить"-->
    <BuyModal></BuyModal>
    <!-- Модальное окно входа -->
    <SingInModal></SingInModal>
    <!-- Модальное окно регистрации -->
    <RegistrationModal></RegistrationModal>
  </div>
</template>

<script>
import '@/assets/sass/head.scss';
import '@/assets/sass/menu.scss';
import '@/assets/sass/section.scss';
import '@/assets/sass/popup-window.scss';
import {popUpWindow} from '@/components/mixins/popUpWindow';
import Section from "@/components/sections/Section";
import BuyModal from "@/components/modals/BuyModal"
import SingInModal from "@/components/modals/SingInModal";
import RegistrationModal from "@/components/modals/RegistrationModal";
import Header from "@/components/Header";
export default {
  name: "Classic",
  components: {Header, RegistrationModal, SingInModal, BuyModal, Section},
  mixins: [popUpWindow],
  data(){
    return{
      pushkinSectionId:[13,14,15,16],
      lermontovSectionId: [17,18,19,20],
      tolstoySectionId: [21,22,23,24]
    }
  },
  mounted() {
    popUpWindow.method.popUp();
  }
}
</script>

<style scoped>

</style>