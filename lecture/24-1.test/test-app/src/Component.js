import PropTypes from 'prop-types';


const FunctionComponent = (props) => {

    const {name} = props
    const style = { 
        color: 'red',
    }

    return (
        <>
        <div><span style={style}>{props.name}</span>는 세상에서 가장 건강한 음식입니다.</div>
        </>
    )
}

FunctionComponent.defaultProps = {
    name : '피자'
}

FunctionComponent.propTypes = {
    name : PropTypes.string
}

export {FunctionComponent}
