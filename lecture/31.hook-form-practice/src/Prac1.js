import React from 'react'
import { useForm } from 'react-hook-form';

export default function Prac1() {
    const {
        register, 
        handleSubmit,
        formState: { errors },
        watch, 
    } = useForm();


    const onValid = (data) => {
            console.log('onValid >>>>> ', data);
        };


    const onInValid = (err) => {
        console.log('onInValid >>>>> ', err);
    };


  return (
    <div>
      <form onSubmit={handleSubmit(onValid, onInValid)}>

        {/* <input 
            type="text" 
            placeholder='이름'
            {...register('username', {
                required: '이름은 필수 항목입니다',
                minLength: {
                    message: '이름은 필수 항목입니다',
                    value: 1,
                },
            })}
       /> */}
        <input 
            type="text" 
            placeholder='이름'
            {...register('username', {
                required: '이름은 필수 항목입니다'
            })}
       />

       
        {errors.username?.message}

        <br />
        <input 
            type="number" 
            placeholder='나이'
            {...register('userage', {
                required: '나이는 필수 항목입니다. ',
                valueAsNumber: true,
                min: {
                  value: 0,
                  message: "0 이상의 숫자만 입력 가능합니다."
                },
            })}
                
       />

        {/* <input 
            type="number" 
            placeholder='나이'
            {...register('userage', {
                validate: {
                    min : v => v > 0? true  : '0이상의 숫자만 입력 가능합니다.'   
                },
            })}
       /> */}

        {errors.userage?.message}
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  )
}
