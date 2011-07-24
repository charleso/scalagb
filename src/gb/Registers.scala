package gb

class Registers {
  
  type Byte = Int
  var a, b, c, d, e, h, l, f : Int = 0
  
  var instructionPointer : Byte = 0
  var stackPointer : Byte = 0
  
  var mClock, tClock : Int = 0
  
  def getFlag(flag : Int) = flag match {
    case 0x80 if (f & 0x80) != 0 => true
    case 0x40 if (f & 0x40) != 0 => true
    case 0x20 if (f & 0x20) != 0 => true
    case 0x10 if (f & 0x10) != 0 => true
  }

  def setFlag(flag : Int) = flag match {
    case 0x80 => f |= 0x80
    case 0x40 => f |= 0x40
    case 0x20 => f |= 0x20
    case 0x10 => f |= 0x10
  }
  
}