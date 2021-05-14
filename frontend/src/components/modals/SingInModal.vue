<template>
  <div>
    <div class="overlay" data-close=""></div>
    <div id="signin" class="dlg-modal">
      <form name = "contact_form">
        <div class="container">
          <h1 style="text-align: center">Вход</h1>
          <!--                <hr>-->
          <label style="padding: 10px; font-size: x-large;"><b>Email:</b></label>
          <br>
          <input type="email"
                 placeholder="ilovebooks@gmail.com"
                 title="Введите email к которому привязан ваш аккаунт"
                 required=""
                 class="input-field">
          <br>
          <label><b>Пароль:</b></label>
          <br>
          <input type="password"
                 placeholder="password"
                 required=""
                 class="input-field">
          <br>
          <div class="clearfix" style="padding-top: 20px;">
            <button type="reset"
                    class="btn btn-dark"
                    title = "Нажмите, чтобы очистить все поля"
                    style="color:#feb386;">Cброс</button>
            <button type = "submit" class="btn btn-dark"
                    title = "Нажмите, чтобы подтвердить свои данные"
                    style="color:#feb386;">Купить</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  name: "SingInModal"
}
</script>

<style scoped>

</style>