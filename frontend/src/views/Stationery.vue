<template>
  <div class ="body">

    <Header></Header>

    <div class="book-block">
      <h2 class="block-title">Хорошие чернила - залог успеха!</h2>
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
      <h2 class="block-title">Набор чертёжника</h2>
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
      <h2 class="block-title">Тетради на все случаи жизни</h2>
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
  name: "Stationary",
  components: {Header, RegistrationModal, SingInModal, BuyModal, Section},
  mixins: [popUpWindow],
  data(){
    return{
      newsSectionId:[25,26,27,28],
      salesSectionId: [29,30,31,32],
      crazyBookSectionId: [33,34,35,36]
    }
  },
  mounted() {
    popUpWindow.method.popUp();
  }
}
</script>

<style scoped>

</style>