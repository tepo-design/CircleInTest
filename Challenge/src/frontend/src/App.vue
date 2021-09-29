<template>
  <hello-world/>
</template>

<script>
import WordCount from './components/WordCountComp.vue'

export default {
  name: 'App',
  components: {
    HelloWorld: WordCount
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
