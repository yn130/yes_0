const birthYearSelect = document.getElementById('birth-year');
    const birthMonthSelect = document.getElementById('birth-month');
    const birthDaySelect = document.getElementById('birth-day');

    const currentYear = new Date().getFullYear();
    for (let year = 1950; year <= currentYear; year++) {
      const option = document.createElement('option');
      option.value = year;
      option.text = year;
      birthYearSelect.appendChild(option);
    }

    for (let month = 1; month <= 12; month++) {
      const option = document.createElement('option');
      option.value = month;
      option.text = month;
      birthMonthSelect.appendChild(option);
    }

    function populateDays() {
      const year = birthYearSelect.value;
      const month = birthMonthSelect.value;
      const daysInMonth = new Date(year, month, 0).getDate();
      birthDaySelect.innerHTML = '';

      for (let day = 1; day <= daysInMonth; day++) {
        const option = document.createElement('option');
        option.value = day;
        option.text = day;
        birthDaySelect.appendChild(option);
      }
    }

    birthYearSelect.addEventListener('change', populateDays);
    birthMonthSelect.addEventListener('change', populateDays);
    populateDays();



function prac2() {
  const form = document.getElementById('form_prac2');
  axios
    .post(`/axios/vo/post/prac2`,
    {
        name: form.name.value,
        gender: form.gender.value,
        year: form.year.value,
        month: form.month.value,
        day: form.day.value,
        interest: form.interest.value,
     })
    .then((res) => {
      console.log(res.data);
    });
    }