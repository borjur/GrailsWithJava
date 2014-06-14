package converter

class ConvertController {
	def index() {
		
	}
	
	def result() {
		def euros = params.usValue.toInteger() * 0.75
		render(view: "result", model: [euros: euros])
	}
}
