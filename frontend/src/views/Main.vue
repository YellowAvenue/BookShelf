<template>
  <div class = "lock" style="margin: 0; padding: 0;">
    <header>
      <div class="user-block">
        <button type="button"
                class="btn user-button"
                style="background-color: #feb386; color: white;"
                data-modal=signin>Войти</button>
        <button type="button"
                class="btn user-button"
                style="background-color: #feb386; color: white;"
                data-modal="registration">Регистрация</button>
        <img src="/img/UserPhoto.png" alt="UserPhoto">
      </div>
      <div class = "title">Bookshelf</div>
      <div class="underTitle">Интернет-магазин</div>
      <div>
        <ul class="menu-main">
          <li><a href="/mainPage" class="current" style="text-decoration: none;"> Главное</a></li>
          <li><a href="/classic" style="text-decoration: none;">Классика</a></li>
          <li><a href="/stationery" style="text-decoration: none;">Канцтовары</a></li>
          <li><a href="/school" style="text-decoration: none;">К школе</a></li>
          <li><a href="/aboutUs" style="text-decoration: none;">О нас</a></li>
        </ul>
      </div>
    </header>

  </div>
  <Id1></Id1>
</template>

<script>
import Id1 from "@/components/books/Id1";
import '@/assets/sass/head.scss'
// import '@/assets/sass/menu.scss'
export default {
  name: "Main.vue",
  components:{
    Id1
  }
}
</script>

<style scoped>

</style>