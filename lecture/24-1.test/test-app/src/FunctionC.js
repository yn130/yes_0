import PropTypes from 'prop-types';


const FunctionC = (props) => {

    const {title, author, price, type } = props;
    const style = {
        h: {
            color: 'red'
        },
        // contents: {
        //     textAlign: "left"

        // }
    }

    return (
        <>
        <div style={style.h}> 이번주 베스트셀러 </div>
        <div><img src="https://image.aladin.co.kr/product/32387/51/cover200/8934971681_1.jpg?RS=170" alt="" /></div>
        <h2> {props.title} </h2>
        <div style={style.contents}>
        <div> 저자 : {props.author} </div>
        <div> 판매가 : {props.price} </div>
        <div> 구분 : {props.type} </div>
        </div>

        </>
    )
}

FunctionC.defaultProps = {

}

FunctionC.propTypes = {
    name : PropTypes.string
}

export {FunctionC}
