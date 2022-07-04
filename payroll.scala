object payrollProgram{
	def main(args: Array[String]) = {
		println("Enter the base payRate: ")
		var basePayrate = scala.io.StdIn.readInt()

		println("Enter hours worked:")
		var hours = scala.io.StdIn.readFloat()

		println("Please enter the shift code: ")
		var shiftCode = scala.io.StdIn.readInt()

		var shiftFactor: Float = shift(shiftCode)

		println("The shiftFactor is: " + shiftFactor)

		var payRate: Float = basePayrate * shiftFactor 
		println("The payRate is: " + payRate)

		var grossPay: Float = hours * payRate
		println("The employee's grossPay is: " + grossPay)

		var taxRate: Float = 0.0

		if(grossPay < 6000){
			taxRate = 0.0
		}

		else if(grossPay >= 6000 && grossPay < 7500){
			taxRate = 0.08
		}

		else if(grossPay >= 7500 && grossPay < 9000){
			taxRate = 0.12
		}

		else if(grossPay >= 9000 && grossPay < 10500){
			taxRate = 0.15
		}

		else{
			taxRate = 0.175
		}

		var withholdingTax: Float = grossPay * taxRate
		println("The withholdingTax is: " + withholdingTax)

		var netPay: Float = grossPay - withholdingTax
		println("The netPay is: " + netPay)

	}

	def shift(x: Int): Float = x match{
		case 0 => 1.0
		case 1 => 1.25
		case 2 => 1.5
	}

}