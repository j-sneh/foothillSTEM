#include <LiquidCrystal.h>
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
int guessable = (int) random(1,10);
const int greenPin = 8;
const int redPin = 9;
const int bluePin = 10;
int greenState,redState,blueState;
int guess = 0;
int guesses = 3;
void setup() {
  // put your setup code here, to run once:
  pinMode(greenPin, INPUT);
  pinMode(redPin, INPUT);
  pinMode(bluePin, INPUT);
  lcd.begin(16,2);
  lcd.clear();
  lcd.println("Guess the number!");
  lcd.print("1 to 10");
  delay(3000);
  lcd.clear();
}

void loop() {
  if (guesses == 0){
    while (true){}
  }
  greenState = digitalRead(greenPin);
  redState = digitalRead(redPin);
  blueState = digitalRead(bluePin);
  lcd.print(guess);
  if (greenState == HIGH){
    ++guess;
  }
  if (redState == HIGH){
    --guess;
  }
  if (blueState == HIGH){
    submit();
  }
}

void submit(){
  if (guess < 1 || guess > 10){
    guess = 0;
    return;
  } else if (guess == guessable){
    lcd.clear();
    lcd.print("You win!");
    while (true) {}
  } else {
    lcd.clear();
    --guesses;
    lcd.print("WRONG! ");
    lcd.println(guesses);
    lcd.print("left");
    delay(2000);
    lcd.clear();
  }
}
