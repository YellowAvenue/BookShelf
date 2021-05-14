<template>
  <div class="overlay" data-close=""></div>
  <div id="modal_buy" class="dlg-modal">
    <form name = "contact_form" @submit="validate_form();">
      <div class="container">
        <h1>Купить сейчас</h1>
        <p>Заполните данные и через несколько минут вам перезвонит наш менеджер для подтверждения заказа.</p>
        <!--            <hr>-->
        <label><b>ФИО:</b></label>
        <br>
        <input type="text"
               placeholder="Иванов Иван Иванович"
               pattern="[А-яа-я]+[ ][А-яа-я]+[ ][А-яа-я]+"
               title="Введите кириллицой имя фамилию отчество разделяя слова пробелами."
               required=""
               class="input-field">
        <br>
        <label><b>Мобильный телефон:</b></label>
        <br>
        <input type="tel"
               placeholder="+79104479731"
               pattern="[\+]?[0-9]{11}"
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
</template>

<script>
export default {
  name: "BuyModal"
}
</script>

<style scoped>

</style>