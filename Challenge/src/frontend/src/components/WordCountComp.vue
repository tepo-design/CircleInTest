<template>
  <div>
    <h2> Check how often you are mentioned! </h2>
    <form v-on:submit.prevent="submitForm">
      <div class="form-group">
        <label for="url"></label>
        <h4>Enter a website URL to scour!</h4>
        <input type="text" class="form-control" id="url" style="width: 240px;" v-model="form.url"
               placeholder="Enter in form: https://www.example.com" pattern="https?://.+" required
               title="Form: https://www.example.com">
      </div>
      <div class="form-group">
        <label for="word"></label>
        <h4>What word are we looking for?</h4>
        <input type="text" class="form-control" id="word" style="width: 200px;" v-model="form.word"
               pattern="[A-Za-z']+" title="Letters & apostrophes only please!">
      </div>
      <br>
      <div class="form-group">
        <button class="btn btn-primary">Submit</button>
      </div>
    </form>
  </div>

  <h1>Number of occurrences: {{ wordCount }}</h1>

</template>


<script>
import axios from 'axios';

export default {
  name: 'Word Counter',
  data() {
    return {
      form: {
        url: '',
        word: ''
      },
      wordCount: ''
    }
  },
  methods: {
    submitForm() {
      axios.get("/api/wordCount/", {
        params: {
          url: this.form.url,
          word: this.form.word
        }
      })
          .then((response) => {
            this.wordCount = response.data;
          })
    }
  }
}
</script>


