<template>
  <div class ="body">

    <Header></Header>

    <div class="book-block">
      <h2 class="block-title">Для успешной сдачи экзаменов</h2>
      <div class = "delimetr"></div>
    </div>

    <suspense>
      <template #default>
        <Section :products-id="newsSectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <div class="book-block">
      <h2 class="block-title">Для самых маленьких</h2>
      <div class = "delimetr"></div>
    </div>

    <suspense>
      <template #default>
        <Section :products-id="salesSectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <div class="book-block">
      <h2 class="block-title">Do you speak English?</h2>
      <div class = "delimetr"></div>
    </div>

    <suspense>
      <template #default>
        <Section :products-id="crazyBookSectionId"></Section>
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
  name: "School",
  components: {Header, RegistrationModal, SingInModal, BuyModal, Section},
  mixins: [popUpWindow],
  data(){
    return{
      newsSectionId:[37,38,39,40],
      salesSectionId: [41,42,43,44],
      crazyBookSectionId: [45,46,47,48]
    }
  },
  mounted() {
    popUpWindow.method.popUp();
  }
}
</script>

<style scoped>

</style>