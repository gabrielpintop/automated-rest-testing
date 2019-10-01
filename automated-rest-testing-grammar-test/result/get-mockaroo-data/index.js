// Gabriel Pinto & Juan Hernandez
const mockaroo = require('mockaroo');
const fs = require('fs');
const json2xls = require('json2xls');
const client = new mockaroo.Client({
  apiKey: '9aa4bd60'
});
const dataDirectory = '../katalon/Data Files/xlsx';
		
const country = client.generate({
  count: 5,
  format: 'json',
  header: true,	
  fields: [
    {
      name: 'id',
      type: 'Row Number'
    },
    {
      name: 'shortName',
      type: 'Country Code'
    },
    {
      name: 'name',
      type: 'Country'
    },
    {
      name: 'native',
      type: 'Words',
      min: 1,
      max: 1
    },
    {
      name: 'phone',
      type: 'Phone'
    },
    {
      name: 'continent',
      type: 'Words',
      min: 1,
      max: 1
    },
    {
      name: 'capital',
      type: 'City'
    },
    {
      name: 'currency',
      type: 'Words',
      min: 1,
      max: 1
    },
    {
      name: 'languages',
      array: true,
      type: 'Words',
      min: 1,
      max: 1
    },
    {
      name: 'emoji',
      type: 'Words',
      min: 1,
      max: 1
    },
    {
      name: 'emojiU',
      type: 'Words',
      min: 1,
      max: 1
    },
  ]
});
		
const student = client.generate({
  count: 5,
  format: 'json',
  header: true,	
  fields: [
    {
      name: 'id',
      type: 'Row Number'
    },
    {
      name: 'first_name',
      type: 'First Name'
    },
    {
      name: 'last_name',
      type: 'Last Name'
    },
    {
      name: 'gender',
      type: 'Gender'
    },
    {
      name: 'code',
      type: 'Words',
      min: 1,
      max: 1
    },
    {
      name: 'country',
      type: 'Country'
    },
    {
      name: 'city',
      type: 'City'
    },
    {
      name: 'university',
      type: 'Words',
      min: 1,
      max: 1
    },
  ]
});
if (!fs.existsSync(dataDirectory)) {
  fs.mkdirSync(dataDirectory);
}

country.then((countryData) => {
  const countryXls = json2xls(countryData);
  fs.writeFileSync('./data/countryData.xlsx', countryXls, 'binary');
}).catch(err => {
  console.error(err);
});

student.then((studentData) => {
  const studentXls = json2xls(studentData);
  fs.writeFileSync('./data/studentData.xlsx', studentXls, 'binary');
}).catch(err => {
  console.error(err);
});
