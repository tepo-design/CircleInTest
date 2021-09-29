<template>
  <div>
    <h2> Check how often you are mentioned! </h2>
    <form v-on:submit.prevent="submitForm">
      <div class="form-group">
        <label for="url"></label>
        <h4>Enter a website URL to scour!</h4>
        <input type="url" class="form-control" id="url" style="width: 200px;">
      </div>
      <div class="form-group">
        <label for="freq"></label>
        <h4>What word are we looking for?</h4>
        <input type="text" class="form-control" id="freq" style="width: 200px;">
      </div>
      <br>
      <div class="form-group">
        <button class="btn btn-primary">Submit</button>
      </div>
    </form>
  </div>

  <h1>{{msg}}</h1>

</template>


<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch("/api/wordCount/?url=https://en.wikipedia.org/wiki/Main_Page&word=today's")
    .then((response) => response.text())
    .then((data) => {
      this.msg = data;
    })
  }

}
</script>

