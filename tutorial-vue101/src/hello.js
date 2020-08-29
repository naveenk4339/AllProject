var app = new Vue({
	el: '#app',
	data: {
		name: 'Bob'
	},			
	methods: {
		toUpper: function() {
			this.name = this.name.toUpperCase()
		}
	}
})

var app2 = new Vue({
  el: '#app-2',
  data: {
	message: 'You loaded this page on ' + new Date().toLocaleString(),
	seen: false,
	todos: [
      { text: 'Learn JavaScript' },
      { text: 'Learn Vue' },
      { text: 'Build something awesome' }
    ]
  },
  methods: {
    reverseMessage: function () {
      this.message = this.message.split('').reverse().join('')
    }
  }
})


Vue.component('todo-item', {
  props: ['todo'],
  template: '<li>{{ todo.text }}</li>'
})

var app7 = new Vue({
  el: '#app-7',
  data: {
    groceryList: [
      { id: 0, text: 'Vegetables' },
	  { id: 1, text: 'Cheese' },
	  { id: 1, text: 'Milk' },
	  { id: 1, text: 'fruits' },
	  { id: 1, text: 'Cheese' },
      { id: 2, text: 'Whatever else humans are supposed to eat' }
    ]
  }
})

