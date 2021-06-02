<template #default>
  <div class ="body">

    <Header></Header>

    <suspense>
      <template #default>
        <!-- Раздел новинок -->
        <Section :products-id="newsSectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <suspense>
      <template #default>
        <!--Раздел главных скидок-->
        <Section :products-id="salesSectionId"></Section>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>

    <suspense>
      <template #default>
        <!--Книги, способные перевернуть ваш разум...-->
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
  name: "MainPage",
  components: {Header, RegistrationModal, SingInModal, BuyModal, Section},
  mixins: [popUpWindow],
  data(){
    return{
      newsSectionId:[1,2,3,4],
      salesSectionId: [5,6,7,8],
      crazyBookSectionId: [9,10,11,12]
    }
  },
  mounted() {
    popUpWindow.method.popUp();
  }

}
</script>

<style scoped>

</style>