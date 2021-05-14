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
        <li><a href="/mainPage" class="current" style="text-decoration: none;"> Главное</a></li>
        <li><a href="/classic" style="text-decoration: none;">Классика</a></li>
        <li><a href="/stationery" style="text-decoration: none;">Канцтовары</a></li>
        <li><a href="/school" style="text-decoration: none;">К школе</a></li>
        <li><a href="/aboutUs" style="text-decoration: none;">О нас</a></li>
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