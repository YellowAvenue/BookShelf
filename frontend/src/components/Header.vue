<template>
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
      <img src='src/assets/img/UserPhoto.png' alt="UserPhoto">
    </div>
    <div class = "title">Bookshelf</div>
    <div class="underTitle">Интернет-магазин</div>
    <div>
      <ul class="menu-main">
        <!-- TODO Добавить реактивную смену класса current -->
        <li><router-link to="/main" class="current" style="text-decoration: none;">Главное</router-link></li>
        <li><router-link to="/classic" style="text-decoration: none;">Классика</router-link></li>
        <li><router-link to="/stationary" style="text-decoration: none;">Канцелярия</router-link></li>
        <li><router-link to="/school" style="text-decoration: none;">К школе</router-link></li>
        <li><router-link to="/aboutUs" style="text-decoration: none;">О нас</router-link></li>
      </ul>
    </div>
  </header></template>

<script>
export default {
name: "Header"
}
</script>

<style scoped>

</style>