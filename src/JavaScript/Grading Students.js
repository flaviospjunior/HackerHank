const grades = [4, 73, 67, 38, 33];

function gradingStudents(grades) {
  return grades
    .filter((grade, index) => index > 0)
    .map((grade) => {
      let resto = grade % 5;
      let somatorio = 5 - resto;
      let proxDivisivel;

      if (somatorio < 3 && grade >= 38) proxDivisivel = grade + somatorio;
      else proxDivisivel = grade;

      return proxDivisivel;
    });
}

console.log(gradingStudents(grades));
