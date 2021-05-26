<template #default>
  <div class ="body">
    <Header></Header>
    <suspense>
      <template #default>
        <!-- Раздел новинок -->
        <NewsSection></NewsSection>
      </template>
      <template #fallback>
        <div>
          Loading...
        </div>
      </template>
    </suspense>
      <!--Раздел главных скидок-->
      <SalesSection></SalesSection>
      <!--Книги, способные перевернуть ваш разум...-->
      <CrazyBookSection></CrazyBookSection>
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
import NewsSection from "@/components/sections/main/NewsSection";
import SalesSection from "@/components/sections/main/SalesSection";
import CrazyBookSection from "@/components/sections/main/CrazyBookSection";
import BuyModal from "@/components/modals/BuyModal"
import SingInModal from "@/components/modals/SingInModal";
import RegistrationModal from "@/components/modals/RegistrationModal";
import Header from "@/components/Header";

export default {
  name: "MainPage",
  components: {Header, RegistrationModal, SingInModal, BuyModal, CrazyBookSection, SalesSection, NewsSection},
  mixins: [popUpWindow],
  mounted() {
    popUpWindow.method.popUp();
  }

}
</script>

<style scoped>

</style>