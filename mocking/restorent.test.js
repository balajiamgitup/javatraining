const prompt = require('prompt-sync')();
// const filecheking=require("./restorenMain");
// const main = require('./restorenMain');
 const restorent=require("./retorentLevel1");
const file=require("fs");
jest.mock("./retorentLevel1");
jest.mock('prompt-sync', () => () => () => '1');

const main = require('./restorenMain');


describe('Mocking billing  ', () => {

    it('Checking bill function  ', () => {
        //   restorent.obj;
        expect(main.main()).toBe("Failed");

    })
});

jest.mock("./retorentLevel1.js");
describe('Mocking billing  ', () => {



    it('Checking bill function  ', () => {

        const bill = 0;

        const order_item = {

            Idlli: 30,

            Dosa: 50,

            Biriyani: 90,

          };

          const order_list = ['Idlli', 'Biriyani'];

          main.bill.billing(bill, order_item, order_list)

        expect(restorent.obj.billling).toHaveBeenCalled();



    })

});
jest.mock('fs')

describe('Testing File system flow ', () => {

    it('Should create order_detals.txt file with writeTextFile call ', () => {

      main.filesave.save();

       /// fileSave.writeTextFile();

        expect(file.writeFileSync).toHaveBeenCalled();

    });

});
// jest.mock("./retorentLevel1.js");
// jest.mock('prompt-sync', () => () => () => 'Idlli');
// describe('Mocking oreder  ', () => {

//   it('Checking bill function  ', () => {
//       //   restorent.obj;
//       expect(restorent.item()).toBe(["Idlli"]);

//   })
// });
